# Backend Code Challenge for Leverton
###### Written by Rishikesh Tirumala

I've pasted the entire code challenge at the bottom of this document. [Jump to challenge](#challenge)


## Assumptions Made
* Any user with access to the index page can read, delete, or add new URLs. 

## Design Decisions and Technologies Used
* I'm using the [Adler-32](https://en.wikipedia.org/wiki/Adler-32) checksum algorithm to create short urls. 

## Notes and Limitations
* I was unable to complete the front-end portion of the application due to a technical issue that took up much of my time. The REST API works on the `/urls` `GET`, `POST`, and `DELETE` endpoints. `POST` and `DELETE` take the String argument `url`.  


## <a name="challenge"></a>Code Challenge
### Shorten URL
* Build a Shorten URL application which allows to manage URLs. 
* You should be able to add new URLs and delete existing ones. 
* Each entry should map to an unique shorten URL and the application have to do a forwarding to the correct page.