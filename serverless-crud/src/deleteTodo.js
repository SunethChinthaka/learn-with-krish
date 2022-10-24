const AWS = require("aws-sdk");

const deleteTodo = async (event) => {
  const dynamodb = new AWS.DynamoDB.DocumentClient();
  const { id } = event.pathParameters;

  let todo;

  try {
    const result = await dynamodb
      .delete({
        TableName: "TodoTable",
        Key: { id },
      })
      .promise();
    todo = result.Item;
  } catch (error) {
    console.log(error);
  }

  return {
    statusCode: 200,
    body: JSON.stringify({
      msg: "ToDo Deleted!",
    }),
  };
};

module.exports = {
  handler: deleteTodo,
};
