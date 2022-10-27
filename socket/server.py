from socket import *

ip = '0.0.0.0'
port = 50000
buflen = 512
# SOCK_STREAM - TCP
listenSoc = socket(AF_INET,SOCK_STREAM)
listenSoc.bind((ip, port))
# 5 - at most 5 connections are permitted
listenSoc.listen(5)
print('server start, waiting for client at {}'.format(port))

dataSoc, addr = listenSoc.accept()
print('one client connected:', addr)

while True:
    recved = dataSoc.recv(buflen)

    if not recved:
        break

    info = recved.decode()
    print('message received:',info)
    respond = input('server:')
    dataSoc.send(respond.encode())

dataSoc.close()
listenSoc.close()