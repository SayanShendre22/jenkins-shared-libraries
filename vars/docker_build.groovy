def call(String projectName ,String ImgTag ,String DockerHubUser ){
  echo "Build stage will run next..."
  sh "docker build -t ${DockerHubUser}/${projectName}:${ImgTag}"
