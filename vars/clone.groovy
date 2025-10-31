def call(String url, String branch){
  echo "Cloning from git"
  git branch: branch, url: url
  echo "Cloning the project is done"
}
