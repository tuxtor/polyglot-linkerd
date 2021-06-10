* linkerd viz dashboard &

* kubectl get -n polyglot deploy -o yaml \
  | linkerd inject - \
  | kubectl apply -f -a

# Tráfico en tiempo real

* linkerd -n polyglot viz top deploy

# Tráfico en un pod en particular

* linkerd -n polyglot viz tap deploy/kservice-a
