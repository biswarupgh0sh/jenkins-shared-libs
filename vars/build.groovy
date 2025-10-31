def call(String imageName, String tag){
  echo "building the image of the app"
  sh "docker build -t ${imageName}:${tag} ."
  echo "build image done"
}
