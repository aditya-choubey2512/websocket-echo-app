# WebSocket Echo Application

## How to Run the WebSocket Echo App
### Build Project
```shell
gw clean build
```

### Build Docker Image
```shell
docker build . -t websocket-echo-app
docker tag websocket-echo-app <Docker ID>/websocket-echo-app
docer push <Docker ID>/websocket-echo-app
```

### Run in Minikube
- Modify `deployment.yaml` to use the correct <Docker ID> at Line 17
```shell
minikube start
kubectl apply deployment.yaml
kubectl apply service.yaml
minikube tunnel
```

### Instrument Application with JavaAgent
- Follow public documentation to instrument the echo application with Traceable Agent.