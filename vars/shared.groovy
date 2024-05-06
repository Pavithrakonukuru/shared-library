def call () {
    sh "aws cloudformation deploy --stack-name ${STACK_NAME} --template-file ${TEMPLATE_FILE} --parameter-overrides InstanceType=${params.InstanceType} ImageId=${params.ImageId} KeyName=${params.KeyName} SecurityGroupIds=${params.SecurityGroupIds} SubnetId=${params.SubnetId} EC2Name=${params.EC2Name} --capabilities CAPABILITY_NAMED_IAM"
}