pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/sjerzak/Backend.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
