peso= float(input("Qual é seu peso? "))
altura= float(input("Qual é sua altura? "))

imc= peso/(altura*altura)
if imc < 30:   
      print("  Você esta saudavel!  " )
else:   
      print( "Você não esta saudavel, reveja seus habitos!  " )
print("seu imc é: ", imc)

