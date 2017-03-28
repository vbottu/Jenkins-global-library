package vv2599.git
def gitCommit(gitPath){
   return "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}
