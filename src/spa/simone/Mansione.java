package spa.simone;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public enum Mansione {

	RESPONSABILE {
		@Override
		public String toString() {
			return "Responsabile";
		}
	},
	
	ANALISTA {
		@Override
		public String toString() {
			return "Analista";
		}
	},
	
	ADDETTO_PRELIEVO {
		@Override
		public String toString() {
			return "Addetto al prelievo";
		}
	}

}