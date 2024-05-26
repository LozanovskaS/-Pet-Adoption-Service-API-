# Pet Adoption API Documentation

## Introduction
This API enables users to manage pet adoption activities, facilitating the process of pet adoption by providing endpoints for pet listing, application submission, and more.

## Base URL
`http://localhost:8082`

## Endpoints

### 1. Create a New Pet Listing
- **HTTP Method:** `POST`
- **Endpoint:** `/pet`
- **Description:** Add a new pet listing for adoption.
- **Request Body:**
  ```json
  {
      "name": "Your Pet's Name",
      "species": "Species of the Pet",
      "breed": "Breed of the Pet",
      "age": 2,
      "gender": "Gender of the Pet",
      "description": "Description of the Pet",
      "status": "Status of the Pet"
  }
Responses:
201 Created: Returns the created pet record.
  ```json
{
    "id": 3,
    "name": "Your Pet's Name",
    "species": "Species of the Pet",
    "breed": "Breed of the Pet",
    "age": 2,
    "gender": "Gender of the Pet",
    "description": "Description of the Pet",
    "status": "Status of the Pet"
}

### 2. List all Pets

- **HTTP Method:** `GET`
- **Endpoint:** `/pet`
- **Description:** Retrieve a list of all available pets for adoption.
- **Responses:**

    - **200 OK:**
        ```json
        [
            {
                "id": 1,
                "name": "Bani",
                "species": "Species of the Pet",
                "breed": "Breed of the Pet",
                "age": 2,
                "gender": "Gender of the Pet",
                "description": "Description of the Pet",
                "status": "Status of the Pet"
            },
            {
                "id": 2,
                "name": "DARKO",
                "species": "Species of the Pet",
                "breed": "Breed of the Pet",
                "age": 2,
                "gender": "Gender

3. Get Pet by ID
HTTP Method: GET
Endpoint: /pet/{id}
Description: Retrieve details of a pet by its ID.
Path Parameters:
id (integer): ID of the pet
Response:
json
Copy code
{
    "id": 3,
    "name": "Your Pet's Name",
    "species": "Species of the Pet",
    "breed": "Breed of the Pet",
    "age": 2,
    "gender": "Gender of the Pet",
    "description": "Description of the Pet",
    "status": "Status of the Pet"
}
4. Update an Existing Pet
HTTP Method: PUT
Endpoint: /pet
Description: Updates an existing pet record.
Request Headers: Content-Type: application/json
Request Body:
json
Copy code
{
    "id": 2,
    "name": "Tom",
    "species": "Dog",
    "breed": "Breed of the Pet",
    "age": 2,
    "gender": "Gender of the Pet",
    "description": "Description of the Pet",
    "status": "Status of the Pet"
}
Responses:
200 OK: Returns the updated pet record.
400 Bad Request: Invalid input.
404 Not Found: Pet not found.
5. Delete a Pet by ID
HTTP Method: DELETE
Endpoint: /pet/{id}
Description: Deletes a pet record by its ID.
Path Parameters:
id (integer): ID of the pet.
Responses:
204 OK: Pet successfully deleted.
404 Not Found: Pet not found.
6. Create a New User
HTTP Method: POST
Endpoint: /users
Description: Creates a new user record.
Request Headers: Content-Type: application/json
Request Body:
json
Copy code
{
    "username": "User's Username",
    "email": "user@example.com",
    "firstName": "User's First Name",
    "lastName": "User's Username",
    "phone": "User's Phone Number",
    "address": "User's Address"
}
Responses:
201 Created:
json
Copy code
{
    "id": 2,
    "adoptionApplications": null,
    "username": "User's Username",
    "email": "user@example.com",
    "firstName": "User's First Name",
    "lastName": "User's Username",
    "phone": "User's Phone Number",
    "address": "User's Address"
}
7. Retrieve All Users
HTTP Method: GET
Endpoint: /users
Description: Retrieves a list of all users.
Responses:
200 OK:
json
Copy code
[
    {
        "id": 1,
        "adoptionApplications": [],
        "username": "DANCEEEE",
        "email": "user@example.com",
        "firstName": "User's First Name",
        "lastName": "Lozanovska",
        "phone": "User's Phone Number",
        "address": "User's Address"
    },
    {
        "id": 2,
        "adoptionApplications": [],
        "username": "Angela",
        "email": "user@example.com",
        "firstName": "User's First Name",
        "lastName": "Josh",
        "phone": "User's Phone Number",
        "address": "User's Address"
    }
]
8. Update an Existing User
HTTP Method: PUT
Endpoint: /users
Description: Updates an existing user record.
Request Body:
json
Copy code
{
    "id": 1,
    "username": "Updated Username",
    "email": "updated@example.com",
    "password": "Updated Password",
    "firstName": "Updated First Name",
    "lastName": "Updated Last Name"
}
Responses:
200 OK: Returns the updated user record.
400 Bad Request: Invalid input.
9. Retrieve a User by ID
HTTP Method: GET
Endpoint: /users/{id}
Description: Retrieves a user record by its ID.
Path Parameters:
id (integer): ID of the user.
Responses:
200 OK: Returns the user record with the specified ID.
404 Not Found: User not found.
10. Delete a User by ID
HTTP Method: DELETE
Endpoint: /users/{id}
Description: Deletes a user record by its ID.
Path Parameters:
id (integer): ID of the user.
Responses:
200 OK: User successfully deleted.
404 Not Found: User not found.
11. Create a New Image
HTTP Method: POST
Endpoint: localhost:8082/image
Description: Adds a new image for a pet listing.
Request Body:
json
Copy code
{
    "pet": {
        "id": 1
    },
    "url": "https://example.com/image.jpg",
    "description": "Description of the image"
}
Responses:
201 Created: Returns the created image record.
400 Bad Request: Invalid input.
12. Retrieve All Images
HTTP Method: GET
Endpoint: /image
Description: Retrieves a list of all images.
Responses:
json
Copy code
{
    "id": 2,
    "pet": {
        "id": 1,
        "name": null,
        "species": null,
        "breed": null,
        "age": 0,
        "gender": null,
        "description": null,
        "status": null
    },
    "url": "https://example.com/image.jpg",
    "description": "A beautiful image of the pet"
}
13. Update an Existing Image
HTTP Method: PUT
Endpoint: /image
Description: Updates an existing image record.
Request Body:
json
Copy code
{
    "id": 1,
    "pet": {
        "id": 1
    },
    "url": "https://example.com/updated-image.jpg",
    "description": "Updated description of the image"
}
Responses:
200 OK: Returns the updated image record.
400 Bad Request: Invalid input.
404 Not Found: Image not found.
14. Retrieve an Image by ID
HTTP Method: GET
Endpoint: /image/{id}
Description: Retrieves an image record by its ID.
Path Parameters:
id (integer): ID of the image.
Responses:
200 OK: Returns the image record with the specified ID.
404 Not Found: Image not found.
15. Delete an Image by ID
HTTP Method: DELETE
Endpoint: /image/{id}
Description: Deletes an image record by its ID.
Path Parameters:
id (integer): ID of the image.
Responses:
200 OK: Image successfully deleted.
404 Not Found: Image not found.
16. Create a New Comment
HTTP Method: POST
Endpoint: /comment
Description: Adds a new comment for a pet listing.
Request Body:
json
Copy code
{
  "pet": {
    "id": 1 
  },
  "user": {
    "id": 2
  },
  "content": "This is a great pet! I love it."
} 
Responses:
201 Created: Returns the created comment record.
400 Bad Request: Invalid input.
17. Retrieve All Comments
HTTP Method: GET
Endpoint: /comment
Description: Retrieves a list of all comments.
Responses:
json
Copy code
[
  {
      "id": 1,
      "pet": {
          "id": 1,
          "name": "KOJ",
          "species": "Species of the Pet",
          "breed": "Breed of the Pet",
          "age": 2,
          "gender": "Gender of the Pet",
          "description": "Description of the Pet",
          "status": "Status of the Pet"
      },
      "user": {
          "id": 2,
          "adoptionApplications": [],
          "username": "Angela",
          "email": "user@example.com",
          "firstName": "User's First Name",
          "lastName": "Madzi",
          "phone": "User's Phone Number",
          "address": "User's Address"
      },
      "content": "This is a great pet! I love it."
  }
]
18. Update an Existing Comment
HTTP Method: PUT
Endpoint: /comment
Description: Updates an existing comment record.
Request Headers: Content-Type: application/json
Request Body:
json
Copy code
{
    "id": 1,
    "pet": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "content": "Updated comment content"
}
Responses:
200 OK: Returns the updated comment record.
400 Bad Request: Invalid input.
404 Not Found: Comment not found.
19. Retrieve a Comment by ID
HTTP Method: GET
Endpoint: /comment/{id}
Description: Retrieves a comment record by its ID.
Path Parameters:
id (integer): ID of the comment.
Responses:
200 OK: Returns the comment record with the specified ID.
404 Not Found: Comment not found.
20. Delete a Comment by ID
HTTP Method: DELETE
Endpoint: /comment/{id}
Description: Deletes a comment record by its ID.
Path Parameters:
id (integer): ID of the comment.
Responses:
204 No Content: Comment successfully deleted.
404 Not Found: Comment not found.
21. Create a New Adoption Application
HTTP Method: POST
Endpoint: /AdoptionApp
Description: Adds a new adoption application.
Request Body:
json
Copy code
{
  "pet": {
    "id": 1 
  },
  "user": {
    "id": 2 
  },
  "status": "pending"
}
Responses:
201 Created: Returns the created adoption application record.
400 Bad Request: Invalid input.
22. Retrieve All Adoption Applications
HTTP Method: GET
Endpoint: /AdoptionApp
Description: Retrieves a list of all adoption applications.
Responses:
json
Copy code
[
  {
      "id": 1,
      "pet": {
          "id": 1,
          "name": "KOJ",
          "species": "Species of the Pet",
          "breed": "Breed of the Pet",
          "age": 2,
          "gender": "Gender of the Pet",
          "description": "Description of the Pet",
          "status": "Status of the Pet"
      },
      "user": {
          "id": 2,
          "adoptionApplications": [],
          "username": "Angela",
          "email": "user@example.com",
          "firstName": "User's First Name",
          "lastName": "Madzi",
          "phone": "User's Phone Number",
          "address": "User's Address"
      },
      "status": "pending"
  }
]
23. Update an Existing Adoption Application
HTTP Method: PUT
Endpoint: /AdoptionApp
Description: Updates an existing adoption application record.
Request Body:
json
Copy code
{
    "id": 1,
    "pet": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "status": "Approved"
}
Responses:
200 OK: Returns the updated adoption application record.
400 Bad Request: Invalid input.
404 Not Found: Adoption application not found.
24. Retrieve an Adoption Application by ID
HTTP Method: GET
Endpoint: /AdoptionApp/{id}
Description: Retrieves an adoption application record by its ID.
Path Parameters:
id (integer): ID of the adoption application.
Responses:
200 OK: Returns the adoption application record with the specified ID.
404 Not Found: Adoption application not found.
25. Delete an Adoption Application by ID
HTTP Method: DELETE
Endpoint: /AdoptionApp/{id}
Description: Deletes an adoption application record by its ID.
Path Parameters:
id (integer): ID of the adoption application.
Responses:
204 No Content: Adoption application successfully deleted.
404 Not Found: Adoption application not found.
