# zipcode-search

Simple secure REST service with JWT. Sign in and search a zipcode to find its State and City.

User's register or sign in, backed by relational database. MySQL for instance, but this could be changed in the properties file.
User then receives JWT to be used with interaction for authentication.
Pass a JSON body with the zipcode and the service will return the state, primary cities, and cities. Not limited to US.



Example of passing a zipcode:
Method: GET

Url: http://localhost:8080/api/zipcode 
JSON body: 
{
    "zipcode" : "26505"
}


Return body:
{
    "zipcode": "26505",
    "primaryCity": "MORGANTOWN",
    "state": "WV",
    "cities": [
        "MORGANTOWN",
        "BOOTH",
        "EVERETTVILLE",
        "STAR CITY",
        "SABRATON"
    ]
}

