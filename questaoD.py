#	Autor: Felipe Nunes
#	Data: 13/09/2016	
import time
entrada = input().split()
inicio = time.time()
a = int(entrada[0])
b = int(entrada[1])
c = int(entrada[2])
d = int(entrada[3])
if a>0 and b>0 and c>0 and d>0 and a<=10**9 and b<=10**9 and c<=10**9 and d<=10**9:
	if c%a == 0:
		aux = int((c/2)+1)
		sucesso = False
		for i in range(a,aux,a):
			if i%b!=0 and d%i!=0:
				print(i)
				sucesso = True
				break
		if not sucesso:
			print("-1")
	else:
		print("-1")
fim = time.time()
print(fim - inicio)