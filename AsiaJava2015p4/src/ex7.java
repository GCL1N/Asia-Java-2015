//輸入成績，並顯示該成績所屬之等第。
import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入成績 : ");
		int score = scn.nextInt();
		if(score >= 97){
			System.out.print("成績等第是 : A+ ");
		}else{if(score <= 96 && score >= 94){
			System.out.print("成績等第是 : A ");
			}else{if(score <= 93 && score >= 90){
				System.out.print("成績等第是 : A- ");
				}else{if(score <= 89 && score >= 87){
					System.out.print("成績等第是 : B+ ");
					}else{if(score <= 86 && score >= 84){
						System.out.print("成績等第是 : B ");
						}else{if(score <= 83 && score >= 80){
							System.out.print("成績等第是 : B- ");
							}else{if(score <= 79 && score >= 77){
								System.out.print("成績等第是 : C+ ");
								}else{if(score <= 76 && score >= 74){
									System.out.print("成績等第是 : C ");
									}else{if(score <= 73 && score >= 70){
										System.out.print("成績等第是 : C- ");
										}else{if(score <= 69 && score >= 67){
											System.out.print("成績等第是 : D+ ");
											}else{if(score <= 66 && score >= 64){
												System.out.print("成績等第是 : D ");
												}else{if(score <= 63 && score >= 60){
													System.out.print("成績等第是 : D- ");
													}else{if(score < 60 ){
														System.out.print("成績等第是 : E ");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

}
