def call() {
    sh 'trivy image krisforu/youtube:latest > trivyimage.txt'
}
