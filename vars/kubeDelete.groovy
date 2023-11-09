def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: ${KUBERNETES_SERVER_URL}, credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: ${CONTEXT_NAME} ) {
        sh "kubectl delete -f deployment.yml"
    }
}
