def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: ${KubernetesServerUrl}, credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ${KubernetesContextName} ) {
        sh "kubectl delete -f Kubernetes/Kubernetes/deployment.yml"
    }
}
