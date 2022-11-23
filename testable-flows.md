#### Here is the list of some testable user flows that I consider to be the most fundamental to test the given app
#### Since it is a simple app, which utilizes the Github API, I am not considering testing the API itself, so the following flows consist of pure UI tests

Testable flows:
1. Verify that the user is able to see the header, the title of the search form, search form and search result section on the page
2. Verify that the input field is empty by default
3. Verify that the user is able to type in the input field
4. Verify that the user is able to click on the "Go" button and see the search results
5. Verify that the user is able to press Enter key to search and see the search results
6. Verify that the user is able to see "Success" message after a search action
7. Verify that user is able to see the results after a "Success" message
8. Verify that the user is able to see the "Github user not found" error message after a search action
9. Verify that there is no results after "Github user not found" error message
10. Verify that the user is able to see a generic error message after a search action
11. Verify that there is no results after a generic error message
12. Verify that the user is able to see the feedback about the result of the search action for a short amount of time
13. Verify that the user is able to see the amount of repos found for a given Github user
14. Verify that the user is able to see repos names and the description in the search results section 
15. Verify that the user is able to see the "–" character in case of a missing description 
16. Verify that the user is able to click on any repo name to navigate to that repo's URL


#### We will have to test all the flows with both clicking the "Go" button and pressing Enter key

