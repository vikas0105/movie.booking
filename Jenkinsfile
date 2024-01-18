pipeline {
  agent {
    label 'king'
  }
  stages {
    stage('checkout') {
      steps {
        sh 'rm -rf  movie.booking'
        sh 'https://github.com/vikas0105/movie.booking.git'
      }
    }
    stage('build') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
     stage('deploy') {
      steps {
        sh 'ssh root@172.31.3.184'
        sh 'scp /home/king/workspace/bus-booking-pipeline/target/bus-booking-app-1.0-SNAPSHOT.jar  root@172.31.3.184:/opt/apache-tomcat-8.5.98/webapps/'
        sh 'echo "launching application"'
      }
    }
  }
}
