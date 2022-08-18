package spa.simone;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public enum TipoEsame {

	EMOCROMO {
		@Override
		public String toString() {
			return "Emocromo";
		}
	},

	GLICEMIA {
		@Override
		public String toString() {
			return "Glicemia";
		}
	},

	URINE {
		@Override
		public String toString() {
			return "Urine";
		}
	},

	TOXO {
		@Override
		public String toString() {
			return "TOXO";
		}
	},

}