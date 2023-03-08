peso= float(input("Qual é seu peso? "))
altura= float(input("Qual é sua altura? "))


imc= peso/(altura*altura)
if imc > 18.5 and imc < 24.9:   
      print("  Você esta saudavel!  " )
elif imc  >  25 and imc< 29.9: 
      print( "Você está com sobrepeso!  " )

elif imc > 30 and imc< 34.4:
     print ("voce é com obeidade 1! ") 
if imc > 35:
    print(" Você esta com obesidade 2! ")   



print("seu imc é: ", imc)

