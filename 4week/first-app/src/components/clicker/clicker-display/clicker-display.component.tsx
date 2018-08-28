import * as React from 'react';

interface IProps {
  clicks: number;
}

export class ClickerDisplay extends React.Component<IProps, {}> {
  public constructor(props: any) {
    super(props);
  }

  public render() {
    return (
      <p className={(this.props.clicks % 5 === 0) ? 'blue' : 'red'}> 
        clicks: {this.props.clicks} 
      </p>
    )
  }

}
