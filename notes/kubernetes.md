
# Termejä

## pods: https://www.bmc.com/blogs/kubernetes-pods/

Pod = 1-N containeria, 
 - podille on oma unique IP osoite
 - internal network
 - shared storage in pod
 - other shared resources ?

Pods are used to run closely related containers. Similar to how one would run them on a dedicated host.
For example, application server, and logstash to collect the logs from the app server. App server container + logstash container in a pod.

Kubernetes cannot manage containers directly, it manages pods.
So most common pod has a single container, to enable running a container in Kubernetes.

Horizontal scaling = running multiple pods with same container configs.

Pod specification = pod configuration: image name, container name, volumes, ...

## deployment

Deployment = 

# Minikube

minikube version

minikube start
- kestää hetken ennen kuin serveri raportoi olevansa päällä

avataan minikuben dashboard sivu:
 minikube dashboard


# kubectl

kubectl version
- kertoo sekä client että server versiot. server vaatii että esim. minikube on started tilassa

kubectl cluster-info
- kertoo klusterin statuksen, pitäisi olla jotain dashboardia yms, mutta jäi vähän epäselväksi

kubectl get nodes
- näyttää kaikki nodet. pitäisi kokeilla isommalla klusterilla. minikube näyttää vain yhtä nodea. miten master?

## luodaan deployment nimeltä hello-node, käyttäen docker imagea tuosta osoitteesta
kubectl create deployment hello-node --image=gcr.io/hello-minikube-zero-install/hello-node

## luodaan pod speksistä
kubectl create -f pod-1.yaml

## listataan podit
kubectl get pods

## ajetaan komento tietylle podille
kubectl exec <PODNAME> service nginx status
- PODNAME saa tuolla get pods komennolla
- esimerkissä oli jostain syystä viiva ennen serviceä, mutta aiheutti errorin ajettaessa

## deletoidaan podi
kubectl delete pod <PODNAME>

## mitä podissa on
kubectl describe pod <PODNAME>

## shelli containeriin podissa
kubectl exec -ti <PODNAME> -c <CONTAINERNAME> —kubeconfig=kubeconfig bash

## kubernetes yleinen konfiguraatio
kubectl config view



https://kubernetes.io/docs/tutorials/hello-minikube/

