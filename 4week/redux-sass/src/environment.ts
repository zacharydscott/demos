const dev = {
  context: 'http://localhost:3000/'
}

const prod = {
  context: 'ec2-18-222-240-107.us-east-2.compute.amazonaws.com:8080/'
}

export const environment = process.env.NODE_ENV === 'production'
  ? prod
  : dev
