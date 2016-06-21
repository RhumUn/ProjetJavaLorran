package dao;

public class LorannWorld extends Entity {

		/** The id. */
		private int			id;
		
		private int x;
		
		private int y;
		
		private int idlevel;
		
		private String interaction;
		
		/** The key. */
		private String	label;
		

		/** The message. */

		/**
		 * Instantiates a new hello world.
		 *
		 * @param id
		 *          the id
		 * @param key
		 *          the key
		 * @param message
		 *          the message
		 */
		public LorannWorld(final int id,int x, int y, int idlevel, final String interaction, final String label) {
			this.setId(id);
			this.setX(x);
			this.setY(y);
			this.setIdlevel(idlevel);
			this.setInteraction(interaction);
			this.setLabel(label);
			
		}

		/**
		 * Instantiates a new hello world.
		 */
		public LorannWorld() {
			this(0, 0, 0, 0, "", "");
		}

		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public int getId() {
			return this.id;
		}

		/**
		 * Sets the id.
		 *
		 * @param id
		 *          the new id
		 */
		public void setId(final int id) {
			this.id = id;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getIdlevel() {
			return idlevel;
		}

		public void setIdlevel(int idlevel) {
			this.idlevel = idlevel;
		}

		public String getInteraction() {
			return interaction;
		}

		public void setInteraction(String interaction) {
			this.interaction = interaction;
		}

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
		
		
}
