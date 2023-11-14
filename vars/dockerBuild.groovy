def buildAndPushDockerImage(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=${RAPID_API_KEY} -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'dockerhubcredentials']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
