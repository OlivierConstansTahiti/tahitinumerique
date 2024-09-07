#---------------------------
# Etape de build
FROM bitnami/node:22-debian-12 AS builder

WORKDIR /app

COPY package.json ./
RUN --mount=type=cache,target=/app/node_modules npm install

COPY angular.json tsconfig.json tsconfig.app.json ./
COPY src/ ./src/
COPY public/ ./public/

RUN --mount=type=cache,target=/app/node_modules npm run build

#---------------------------
# Etape de lancement
FROM bitnami/nginx:1.27.1-debian-12-r3

COPY nginx/angular_default_location.conf /opt/bitnami/nginx/conf/bitnami/

# Image nonroot par défaut
USER 1001

WORKDIR /app
COPY --from=builder /app/dist/browser .

COPY --from=builder /app/public ./public

EXPOSE 8080
ENTRYPOINT ["nginx", "-g", "daemon off;"]

