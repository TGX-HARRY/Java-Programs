public class TestpadOOPS43 {
    class Box {
        private int length;
        private int breadth;
        private int height;
        public Box() {
           this.length = 0;
           this.breadth = 0;
           this.height = 0;
        }

        public Box(int length, int breadth, int height) {
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }

        public Box(Box obj) {
            this.length = obj.length;
            this.breadth = obj.breadth;
            this.height = obj.height;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }

        public int getHeight() {
            return height;
        }

        public long calculateVolume() {
            long ans = length * breadth * height;
            return ans;
        }
    }
    
}
