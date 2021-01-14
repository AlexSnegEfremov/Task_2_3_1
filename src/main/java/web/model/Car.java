package web.model;



public class Car {

        private String car;


        private String model;
        private String modelVersion;

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getModelVersion() {
            return modelVersion;
        }

        public void setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
        }

        public Car() {

        }

        public Car(String car, String model, String modelVersion) {
            this.car = car;
            this.model = model;
            this.modelVersion = modelVersion;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "car='" + car + '\'' +
                    ", model='" + model + '\'' +
                    ", modelVersion='" + modelVersion + '\'' +
                    '}';
        }

}
