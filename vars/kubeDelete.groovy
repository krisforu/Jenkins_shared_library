def call(String KubernetesContextName, String KubernetesServerUrl) {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: ${KubernetesContextName}, credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ${KubernetesServerUrl} ) {
        sh "kubectl delete -f Kubernetes/Kubernetes/deployment.yml"
    }
}
