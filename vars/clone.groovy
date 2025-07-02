def call(String url,String branch){
 sh "rm git-url: -b ${branch}  ${url}"
 git url: "${url}", branch: "${branch}"
}
