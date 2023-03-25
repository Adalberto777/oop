using model;

namespace model
{
        public abstract class Product
    {    
        protected string name;
        public Product(){}

        public string GetName()
        {
            return name;
        }

        public void SetName(string name) 
        {
            this.name = name;
        } 
        
    }
}