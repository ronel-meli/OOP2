package challenge 7;
abstract public class Account {

        protected int id;
        protected String name;
        private DataSource myData;

        public void performOperation(DataSource _myData){
            myData = _myData;
            myData.execute();
        }
    }
    

