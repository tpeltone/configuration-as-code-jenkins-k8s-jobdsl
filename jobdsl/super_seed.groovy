job('super-seed') {
  scm {
    git {
      remote {
        url ('git@github.com:tpeltone/configuration-as-code-jenkins-k8s-jobdsl.git')
        credentials('jenkins-github-ssh')
      }
    }
  }
  steps {
    dsl {
      external('jobdsl/**/*.groovy')
      removeAction('DELETE')
    }
  }
}
