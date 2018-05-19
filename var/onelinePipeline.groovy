import groovy.transform.Field

@Field String 

def call(body) {
  def pipelineParams = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  
  pipeline {
    agent any
    
    options {
      timestamps()
    }
    
    environment {
      def status = ''
    }
    
    stages {
      stage('Build') {
        
      }
      
      stage('Test') {
        
      }
    }
  }
}
