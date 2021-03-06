class MyButton extends JButton {

	        private Color hoverBackgroundColor;
	        private Color pressedBackgroundColor;

	        public MyButton() {
	            this(null);
	        }

	        

			public MyButton(String text) {
	            super(text);
	            super.setContentAreaFilled(false);
	        }

	     
	        protected void paintComponent(Graphics g) {
	            if (getModel().isPressed()) {
	                g.setColor(pressedBackgroundColor);
	            } else if (getModel().isRollover()) {
	                g.setColor(hoverBackgroundColor);
	            } else {
	                g.setColor(getBackground());
	            }
	            g.fillRect(0, 0, getWidth(), getHeight());
	            super.paintComponent(g);
	        }

	      
	        public void setContentAreaFilled(boolean b) {
	        }

	        public Color getHoverBackgroundColor() {
	            return hoverBackgroundColor;
	        }

	        public void setHoverBackgroundColor(Color hoverBackgroundColor) {
	            this.hoverBackgroundColor = hoverBackgroundColor;
	        }

	        public Color getPressedBackgroundColor() {
	            return pressedBackgroundColor;
	        }

	        public void setPressedBackgroundColor(Color pressedBackgroundColor) {
	            this.pressedBackgroundColor = pressedBackgroundColor;
	        }
	    }