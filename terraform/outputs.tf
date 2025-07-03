output "jenkins_master_ip" {
  value = aws_instance.jenkins_master.public_ip
}

output "jenkins_slave_ip" {
  value = aws_instance.jenkins_slave.public_ip
}

output "k8s_master_ip" {
  value = aws_instance.k8s_master.public_ip
}

output "k8s_worker_ips" {
  value = [
    aws_instance.k8s_worker1.public_ip,
    aws_instance.k8s_worker2.public_ip
  ]
}

