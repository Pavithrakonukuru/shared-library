@Library('shared') _
pipeline {
    agent any

    environment {
        AWS_DEFAULT_REGION = 'us-west-2' // Replace with your AWS region
        STACK_NAME = 'MyEC2Stack' // Replace with your desired CloudFormation stack name
        TEMPLATE_FILE = 'ec2.yaml' // Replace with the path to your CloudFormation template file
    }

    parameters {
        string(name: 'InstanceType', defaultValue: 't2.micro', description: 'EC2 instance type')
        string(name: 'ImageId', description: 'ID of the Amazon Machine Image (AMI) to use')
        string(name: 'KeyName', description: 'Name of the EC2 key pair for SSH access')
        string(name: 'SecurityGroupIds', description: 'IDs of the security groups for the instance')
        string(name: 'SubnetId', description: 'ID of the subnet where the instance will be launched')
        string(name: 'EC2Name', description: 'Name of the EC2 instance')
    }
    stages {
        stage('Deploy CloudFormation Stack') {
            steps {
                withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'pavi', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
                    script {
                        shared()
                    }
                }
            }
        }
    }
}