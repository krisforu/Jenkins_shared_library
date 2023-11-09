def call() {
    withSonarQubeEnv('Sonar-Server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
    }
}
