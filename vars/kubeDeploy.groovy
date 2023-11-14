def call(String kubernetesContextName, String kubernetesServerUrl) {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: ${kubernetesContextName}, credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ${kubernetesServerUrl} ) {
        sh "kubectl apply -f  Kubernetes/Kubernetes/deployment.yml"
    }
}
