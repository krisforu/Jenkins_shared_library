def call(String dockerHubUsername, String imageName, String rapidApiKey) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=${rapidApiKey} -t ${imageName} ."
    // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'dockerhubcredentials']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
