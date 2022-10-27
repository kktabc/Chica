from socket import *

ip = '127.0.0.1'
server_port = 50000
buflen = 1024

dataSoc = socket(AF_INET, SOCK_STREAM)

dataSoc.connect((ip, server_port))

while True:
    tosend = input('client:')

    if tosend == 'q':
        break
    dataSoc.send(tosend.encode())

    recved = dataSoc.recv(buflen)

    if not recved:
        break
    print(recved.decode())

dataSoc.close()