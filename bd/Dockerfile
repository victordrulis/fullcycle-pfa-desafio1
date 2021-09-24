
docker network create -d bridge --subnet=172.28.0.0/16 redepfa

docker run \
    --name=mysql5 --net porto_cinzento --ip 172.28.0.11 \
    -e MYSQL_ROOT_PASSWORD=mysql@local \
    -e TZ=America/Sao_Paulo \
    -v $(pwd)/mysql5:/var/lib/mysql \
    -d mysql:5.7.30

# CREATE DATABASE fcdb;
# CREATE USER 'app'@'%' IDENTIFIED BY 'mysql@local';
# GRANT ALL PRIVILEGES ON fcdb.* TO 'app'@'%';
# GRANT SELECT ON *.* TO 'app'@'%';