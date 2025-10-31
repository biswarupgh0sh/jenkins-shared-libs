def call(String imageName, String tag) {
    echo "pushing to docker registry"
    withCredentials([usernamePassword('credentialsId': "dockerhubCreds", passwordVariable:"dockerhubPass", usernameVariable:"dockerhubUser")]) {
      sh "echo ${env.dockerhubPass} | docker login -u ${env.dockerHubUser} --password-stdin"
      sh "docker tag ${imageName}:${tag} ${env.dockerHubUser}/${imageName}:${tag}"
      sh "docker push ${env.dockerHubUser}/${imageName}:${tag}"   
    }
}
