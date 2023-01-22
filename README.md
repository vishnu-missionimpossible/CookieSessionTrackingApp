# CookieSessionTrackingApp

1. In HttpSession tracking mechanism, for every client, there will be session object created on the server side and if there are more no of clients means more session objects will be created becasue of which there is a delay in the response.
2. Cookie session tracking is the one which will create the session object on the client side without his knowledge.
3. In this app we have created 3 forms and 3 servelts.
4. Each form contains 2 fields.
5. In the first servlet, we will map to form 1 and we will collect the data from form 1 using request object and then we will create a cookie and store the data in it and then we will forward the request to the second servlet.
6. In the second servlet, we will map to form 2 and we will collect the data from form 2 using request object and then we will create a cookie and store the data in it and then we will forward the request to the third servlet.
7. In the third servlet, we will map to form 3 and we will collect the data from form 2 using request object and then we will collect the cookies data from the request object(all cookies data) and store it in Cookie[] and the display the response.
