package model;

public class Operacao {
	private static final int DIV=1,SUB=2,ADIC=3,MULT=4;
	private static double resultado;
	private static int tipoOp;
	
	public static String verificarOp(){
		switch (tipoOp) {
		case DIV:
			return "/";
		case SUB:
			return "-";
		case ADIC:
			return "+";
		case MULT:
			return "x";
		default:
			break;
		}
		return "ou";
	}

	public static double efetuarOp(double num1, double num2) throws ExcecaoZero{
		if((tipoOp == DIV) && (num2==0)){
			throw new ExcecaoZero();
		}else{

			switch (tipoOp) {
			case DIV:
				resultado=num1/num2;
				break;
			case SUB:
				resultado=num1-num2;
				break;
			case ADIC:
				resultado=num1+num2;
				break;
			case MULT:
				resultado=num1*num2;
				break;

			default:
				break;
			}
			
		}
		return resultado;
	}

	public static int getTipoOp() {
		return tipoOp;
	}

	public static void setTipoOp(int tipoOp) {
		Operacao.tipoOp = tipoOp;
	}



}
