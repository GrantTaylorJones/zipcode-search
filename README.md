# zipcode-search
Simple secure REST service for zipcode search.

User signs in/registers, stored in relational database.
JWT passed back and used for authentication.
User gives zipcode and is returned the State and City, not limited to US.

NOTE: The zipcodes are stored in a hashtable upon server start. This initial process can take a few minutes, but after, zipcode look up should have a quick, constant retrieval.



