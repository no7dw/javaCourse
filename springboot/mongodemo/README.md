### mongodb basic example

#### use hibernateTemplate to prevent sql injection

```
    public  List<Account> findByName(String name) {
            List<Account> accountList = new ArrayList<Account>();
            String queryString = "from Account where name is:name";
            accountList = (List<Account>) hibernateTemplate.findByNamedParam(queryString,"name",name);
            return accountList;
        }
```