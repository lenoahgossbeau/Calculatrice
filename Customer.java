package cm.itac.web;

public class Customer {
	
		private String nomClient;
		private String prenomClient;
		private String adresseClient;
		private String telephoneClient;
		private String emailClient;

		public Customer(){
		
		}
		
		public String getNom(){
			return nomClient;
		}
		public String getPrenom(){
			return prenomClient;
		}
		public String getAdresse(){
			return adresseClient;
		}
		public String getTel(){
			return telephoneClient;
		}
		public String getEmail(){
			return emailClient;
		}
		public void setNom(String nomClient){
			this.nomClient=nomClient;
		}
		public void setPrenom(String prenomClient){
			this.prenomClient=prenomClient;
		}
		public void setAdresse(String adresseClient){
			this.adresseClient=adresseClient;
		}
		public void setTel(String telephoneClient){
			this.telephoneClient=telephoneClient;
		}
		public void setEmail(String emailClient){
			this.emailClient=emailClient;
		}

}
