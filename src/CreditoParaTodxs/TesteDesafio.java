package CreditoParaTodxs;
import java.util.Scanner;

public class TesteDesafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Emprestimo cr�dito=new Emprestimo();
		cr�dito.setFaixaEmprestimo1(3000);
		 
		Emprestimo cr�dito1=new Emprestimo();
		cr�dito1.setFaixaEmprestimo2(5000);
		
		Emprestimo cr�dito2=new Emprestimo();
		cr�dito2.setFaixaEmprestimo3(8000);
		
	
		double montante=cr�dito.getFaixaEmprestimo1() +((cr�dito.getFaixaEmprestimo1()*2.3/100)*6);
    	double montante1=cr�dito.getFaixaEmprestimo1() +((cr�dito.getFaixaEmprestimo1()*2.6/100)*12);
    	double montante2=cr�dito.getFaixaEmprestimo1() +((cr�dito.getFaixaEmprestimo1()*2.9/100)*24);
    	
    	double montante3=cr�dito1.getFaixaEmprestimo2() +((cr�dito1.getFaixaEmprestimo2()*2.3/100)*6);
    	double montante4=cr�dito1.getFaixaEmprestimo2() +((cr�dito1.getFaixaEmprestimo2()*2.6/100)*12);
    	double montante5=cr�dito1.getFaixaEmprestimo2() +((cr�dito1.getFaixaEmprestimo2()*2.9/100)*24);
    	
    	double montante6=cr�dito2.getFaixaEmprestimo3() +((cr�dito2.getFaixaEmprestimo3()*2.3/100)*6);
    	double montante7=cr�dito2.getFaixaEmprestimo3() +((cr�dito2.getFaixaEmprestimo3()*2.6/100)*12);
    	double montante8=cr�dito2.getFaixaEmprestimo3() +((cr�dito2.getFaixaEmprestimo3()*2.9/100)*24);
		
    	 
    	
    	
		double salario=0;
		int parcelas=0;
		String cpf;
		String nome;
		int op=0;
		
		
		//acesso ao menu de op��es la�o while pra rodar o menu 
		while(op <=1) {
			System.out.println("Bem vindo ao Cr�ditoParaTodxs -1-Emprestimo 2-sair");
			op=scan.nextInt();
			System.out.println("Digite seu nome:");
			nome=scan.next();
			System.out.println("entre com seu Cpf:");
			cpf=scan.next();
			
			if(op==1) {
				System.out.println("Sr. "+ nome+",seja bem vindo "
						+ "\nSeu Cpf �:"+  cpf);
			    System.out.println("Informe seu sal�rio:");
			     salario=scan.nextDouble();
			     
			    
			    // faixa salarial at� 2500
			    if(salario >=1100 && salario<=2500) {
		   	System.out.println("Voc� tem disponivel para emprestimo:"
			    			+ "R$ "+cr�dito.getFaixaEmprestimo1() );
			    	System.out.println("informe a quantidade de parcelas");
			    	parcelas=scan.nextInt();		
			    	
			    	if(parcelas==6) {
			    		System.out.println("Valor contratado: R$ "+ montante);
			    		System.out.println("A parcela mensal � de:"+montante/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		 if(x==1) {
			    			 System.out.println("**********  RESUMO *********");
			    			 System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("****************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    	if(parcelas==12) {
			    		System.out.println("Valor contratado: R$ "+ montante);
			    		System.out.println("A parcela mensal � de:"+ montante/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("**********  RESUMO *********");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("***************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	 }
			    		
			    	
			    	if(parcelas==24) {
			    		System.out.println("Valor contratado: R$ "+ montante);
			    		System.out.println("A parcela mensal � de:" + montante/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("***********************************************************");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("***********************************************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    }
				// fim da faixa salarial at� 2500
				//**********************************************************************************************//
				// inicio da faixa salarial de 2501 at�  4500  CR�DITO 5000
				
			    if(salario >=2501 && salario <=4500 ) {
			    	
			    	System.out.println("Voc� tem disponivel para emprestimo:"
			    			+ "R$ "+cr�dito1.getFaixaEmprestimo2() );
			    	System.out.println("informe a quantidade de parcelas");
			    	parcelas=scan.nextInt();
			    	
			    	if(parcelas==6) {
			    		System.out.println("Valor contratado: R$ "+ montante3);
			    		System.out.println("A parcela mensal � de:"+montante3/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		 if(x==1) {
			    			 System.out.println("**********  RESUMO *********");
			    			 System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante3 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante3/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("****************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    	
			    	if(parcelas==12) {
			    		System.out.println("Valor contratado: R$ "+ montante4);
			    		System.out.println("A parcela mensal � de:"+ montante4/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("**********  RESUMO *********");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante4 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante4/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("***************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    	
			    	
			    	if(parcelas==24) {
			    		
			    		System.out.println("Valor contratado: R$ "+ montante5);
			    		System.out.println("A parcela mensal � de:" + montante5/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("**********  RESUMO *********");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante5 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante5/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("****************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    }
			 //  fim da faixa salarial de 2501 at�  4500 - CR�DITO DISPONIVEL 5000
			  //**********************************************************************************************//
			    //inicio da faixa salarial acima de 4501- CR�DITO 8000
			    if(salario > 4501) {
			    	System.out.println("Voc� tem disponivel para emprestimo:"
			    			+ "R$ "+cr�dito2.getFaixaEmprestimo3() );
			    	System.out.println("informe a quantidade de parcelas");
			    	parcelas=scan.nextInt();
			    	
			    	if(parcelas==6) {
			    		
			    		System.out.println("Valor contratado: R$ "+ montante6);
			    		System.out.println("A parcela mensal � de:"+montante6/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		 if(x==1) {
			    			 System.out.println("**********  RESUMO *********");
			    			 System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante6 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante6/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("*****************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    	if(parcelas==12) {
			    		
			    		System.out.println("Valor contratado: R$ "+ montante7);
			    		System.out.println("A parcela mensal � de:"+ montante7/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("**********  RESUMO *********");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante7 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante7/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("***************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}
			    	if(parcelas==24) {
			    		
			    		System.out.println("Valor contratado: R$ "+ montante8);
			    		System.out.println("A parcela mensal � de:" + montante8/parcelas );
			    		System.out.println("Contratar emprestimo: 1-sim 2-n�o");
			    		int x=scan.nextInt();
			    		
			    		if(x==1) {
			    			System.out.println("**********  RESUMO *********");
			    			System.out.println("Sr. "+ nome +"\nO(A) Sr(a). contratou: R$ "+ montante8 + "\nQuantidade de parcelas:"
			    					 +parcelas + "\nSua parcela mensal � de R$:"+ montante8/parcelas +"\nSeu Cpf:"+cpf);
			    			 System.out.println("***************************");
			    		 }else {
			    			 System.out.println("Obrigado por usar nossos servi�os"); 
			    		 }
			    	}	
			    	 
			    }//fim da faixa salarial acima de 4501
			   
			   
			}//fim da op ==1
			if(op==2) {
				System.out.println("Obrigado por usar nossos servi�os");
			}
				
		}//fim do while menu emprestimo, sair
		
	}//fim public static void main(String[] args)
}//fim class TesteDesafio


			
			
			
			
		

	

