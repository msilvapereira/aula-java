Exercício de Programação Orientada a Objeto 
Prof. Francesco Artur Perrotti – Fatec Americana
Um estacionamento que vende carros usados deseja informatizar seu sistema de controle de carros. Para todos os carros é preciso registrar a placa, o ano de fabricação, o modelo do carro e o valor de compra (quanto foi pago pelo carro). Também é necessário um atributo que informe se o carro está disponível ou não. Depois que o carro é vendido, deve ficar marcado como vendido (não disponível) e deve ter o nome do vendedor e o valor de venda armazenados. 
Os seguintes métodos devem estar disponíveis:

public boolean disponivel(): Retorna true se o carro está disponível, ou seja, ainda não foi vendido. Retorna false se o carro já foi vendido. Quando é criada uma instância de um carro, ele começa disponível, o nome do vendedor fica em branco e o valor de venda zerado.
public boolean oferta(double valor): Retorna true se o valor ofertado para o carro é aceitável. Um valor é aceitável se for pelo menos 10% maior que o preço de compra.
public boolean venderCarro(String vendedor, double ValorVenda): Vende o carro. O carro passa a ser marcado como vendido (não disponível) e o nome do vendedor e o valor de venda são armazenados. Retorna false (e não faz nada) se:
1)	O valor de venda não é aceitável. 
2)	O carro já tinha sido vendido antes.
public double comissao():Apenas para carros já vendidos. Retorna a comissão do vendedor. A comissão é de 10% sobre a diferença entre o preço de venda e o preço de compra. Se o carro ainda não foi vendido, retorna zero.
public void imprimeDados():Imprime todos os atributos do carro na saída padrão. Deve informar também se o carro está disponível ou se foi vendido. Caso o carro já tenha sido vendido, informar também o nome do vendedor e a comissão que tem direito.
