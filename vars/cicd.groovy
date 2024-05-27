
def gitdownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def artifact()
{
  sh "mvn packge"
}

