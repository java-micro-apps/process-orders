# process-orders

```
docker build -t guntukaramakrishna/process-orders .

docker run -p 8080:8080 --name=yourownname guntukaramakrishna/process-orders:latest

kubectl create deployment process-orders --image=guntukaramakrishna/process-orders --dry-run -o=yaml > image-deployment.yaml

kubectl create service clusterip process-orders --tcp=8080:8080 --dry-run=client -o=yaml >> service-deployment.yaml

kubectl create -f image-deployment.yml

kubectl port-forward service/process-orders 8080:8080

```
